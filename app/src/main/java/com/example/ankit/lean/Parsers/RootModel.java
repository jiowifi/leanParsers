import java.util.ArrayList;

class RootModel {

	public String email;
	public String timezone;
	public String location_name;
	public String topic;
	public String logo;
	public String organizer_name;
	public VersionModel _version;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String name;
	public String organizer_description;
	public String end_time;
	public int id;
	public String description;
	public String start_time;
	public String type;
	public String code_of_conduct;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String schedule_published_on;

	public RootModel(String email, String timezone, String location_name, String topic, String logo, String organizer_name, VersionModel version, String privacy, Call_for_papersModel call_for_papers, CopyrightModel copyright, CreatorModel creator, String name, String organizer_description, String end_time, int id, String description, String start_time, String type, String code_of_conduct, String background_image, ArrayList<Social_linksModel> social_links, String state, String schedule_published_on) {

		this.email = email;
		this.timezone = timezone;
		this.location_name = location_name;
		this.topic = topic;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this._version = version;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this._creator = creator;
		this.name = name;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.id = id;
		this.description = description;
		this.start_time = start_time;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.social_links = social_links;
		this.state = state;
		this.schedule_published_on = schedule_published_on;

	}

}