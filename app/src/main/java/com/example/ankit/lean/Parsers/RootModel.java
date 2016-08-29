import java.util.ArrayList;

class RootModel {

	public String background_image;
	public VersionModel _version;
	public String name;
	public String code_of_conduct;
	public String state;
	public String organizer_name;
	public String location_name;
	public String topic;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public CreatorModel _creator;
	public String start_time;
	public String email;
	public CopyrightModel _copyright;
	public String logo;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String description;
	public String privacy;
	public String type;
	public String schedule_published_on;

	public RootModel(String background_image, VersionModel version, String name, String code_of_conduct, String state, String organizer_name, String location_name, String topic, int id, ArrayList<Social_linksModel> social_links, String timezone, CreatorModel creator, String start_time, String email, CopyrightModel copyright, String logo, String organizer_description, Call_for_papersModel call_for_papers, String end_time, String description, String privacy, String type, String schedule_published_on) {

		this.background_image = background_image;
		this._version = version;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.topic = topic;
		this.id = id;
		this.social_links = social_links;
		this.timezone = timezone;
		this._creator = creator;
		this.start_time = start_time;
		this.email = email;
		this._copyright = copyright;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.description = description;
		this.privacy = privacy;
		this.type = type;
		this.schedule_published_on = schedule_published_on;

	}

}