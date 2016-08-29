import java.util.ArrayList;

class RootModel {

	public String type;
	public CopyrightModel _copyright;
	public String logo;
	public String background_image;
	public String name;
	public String end_time;
	public String schedule_published_on;
	public String location_name;
	public VersionModel _version;
	public String privacy;
	public String state;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String code_of_conduct;
	public String timezone;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String email;
	public String organizer_description;
	public CreatorModel _creator;
	public String start_time;

	public RootModel(String type, CopyrightModel copyright, String logo, String background_image, String name, String end_time, String schedule_published_on, String location_name, VersionModel version, String privacy, String state, int id, ArrayList<Social_linksModel> social_links, String topic, String code_of_conduct, String timezone, String organizer_name, Call_for_papersModel call_for_papers, String description, String email, String organizer_description, CreatorModel creator, String start_time) {

		this.type = type;
		this._copyright = copyright;
		this.logo = logo;
		this.background_image = background_image;
		this.name = name;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._version = version;
		this.privacy = privacy;
		this.state = state;
		this.id = id;
		this.social_links = social_links;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.email = email;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.start_time = start_time;

	}

}