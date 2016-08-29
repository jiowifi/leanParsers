import java.util.ArrayList;

class RootModel {

	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String topic;
	public String end_time;
	public String schedule_published_on;
	public String state;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String privacy;
	public String timezone;
	public String email;
	public String logo;
	public String type;
	public String location_name;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String description;
	public String start_time;
	public String name;
	public String organizer_name;

	public RootModel(String background_image, ArrayList<Social_linksModel> social_links, CreatorModel creator, String topic, String end_time, String schedule_published_on, String state, String code_of_conduct, CopyrightModel copyright, VersionModel version, String privacy, String timezone, String email, String logo, String type, String location_name, int id, Call_for_papersModel call_for_papers, String organizer_description, String description, String start_time, String name, String organizer_name) {

		this.background_image = background_image;
		this.social_links = social_links;
		this._creator = creator;
		this.topic = topic;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._version = version;
		this.privacy = privacy;
		this.timezone = timezone;
		this.email = email;
		this.logo = logo;
		this.type = type;
		this.location_name = location_name;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.description = description;
		this.start_time = start_time;
		this.name = name;
		this.organizer_name = organizer_name;

	}

}