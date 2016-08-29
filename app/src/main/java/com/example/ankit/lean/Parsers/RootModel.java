import java.util.ArrayList;

class RootModel {

	public String topic;
	public String start_time;
	public String description;
	public VersionModel _version;
	public String state;
	public String end_time;
	public int id;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String organizer_description;
	public CreatorModel _creator;
	public String timezone;
	public String email;
	public String location_name;
	public String type;
	public String logo;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String schedule_published_on;

	public RootModel(String topic, String start_time, String description, VersionModel version, String state, String end_time, int id, String code_of_conduct, CopyrightModel copyright, String organizer_description, CreatorModel creator, String timezone, String email, String location_name, String type, String logo, String name, Call_for_papersModel call_for_papers, String organizer_name, String privacy, ArrayList<Social_linksModel> social_links, String background_image, String schedule_published_on) {

		this.topic = topic;
		this.start_time = start_time;
		this.description = description;
		this._version = version;
		this.state = state;
		this.end_time = end_time;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.timezone = timezone;
		this.email = email;
		this.location_name = location_name;
		this.type = type;
		this.logo = logo;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.social_links = social_links;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;

	}

}