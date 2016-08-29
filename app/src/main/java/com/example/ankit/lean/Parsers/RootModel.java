import java.util.ArrayList;

class RootModel {

	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String organizer_description;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String privacy;
	public String schedule_published_on;
	public String topic;
	public CopyrightModel _copyright;
	public String logo;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String start_time;
	public VersionModel _version;
	public String location_name;
	public String state;
	public String timezone;
	public String description;
	public String background_image;
	public String name;
	public String organizer_name;

	public RootModel(String type, ArrayList<Social_linksModel> social_links, String email, String organizer_description, CreatorModel creator, String code_of_conduct, String privacy, String schedule_published_on, String topic, CopyrightModel copyright, String logo, String end_time, Call_for_papersModel call_for_papers, int id, String start_time, VersionModel version, String location_name, String state, String timezone, String description, String background_image, String name, String organizer_name) {

		this.type = type;
		this.social_links = social_links;
		this.email = email;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._copyright = copyright;
		this.logo = logo;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.start_time = start_time;
		this._version = version;
		this.location_name = location_name;
		this.state = state;
		this.timezone = timezone;
		this.description = description;
		this.background_image = background_image;
		this.name = name;
		this.organizer_name = organizer_name;

	}

}