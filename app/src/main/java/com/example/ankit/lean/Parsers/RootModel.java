import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String background_image;
	public String privacy;
	public String name;
	public String timezone;
	public String state;
	public String schedule_published_on;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String code_of_conduct;
	public VersionModel _version;
	public int id;
	public String type;
	public String topic;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String email;
	public String description;
	public String location_name;

	public RootModel(String end_time, String background_image, String privacy, String name, String timezone, String state, String schedule_published_on, String organizer_name, ArrayList<Social_linksModel> social_links, String organizer_description, String code_of_conduct, VersionModel version, int id, String type, String topic, CreatorModel creator, CopyrightModel copyright, String logo, Call_for_papersModel call_for_papers, String start_time, String email, String description, String location_name) {

		this.end_time = end_time;
		this.background_image = background_image;
		this.privacy = privacy;
		this.name = name;
		this.timezone = timezone;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.id = id;
		this.type = type;
		this.topic = topic;
		this._creator = creator;
		this._copyright = copyright;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.email = email;
		this.description = description;
		this.location_name = location_name;

	}

}