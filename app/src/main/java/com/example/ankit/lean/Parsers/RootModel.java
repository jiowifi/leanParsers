import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public CreatorModel _creator;
	public String organizer_name;
	public String topic;
	public String email;
	public String logo;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String timezone;
	public String state;
	public int id;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String code_of_conduct;
	public String type;
	public String organizer_description;
	public String location_name;
	public String start_time;
	public String description;

	public RootModel(String end_time, String privacy, Call_for_papersModel call_for_papers, String background_image, CreatorModel creator, String organizer_name, String topic, String email, String logo, VersionModel version, CopyrightModel copyright, String timezone, String state, int id, String schedule_published_on, ArrayList<Social_linksModel> social_links, String name, String code_of_conduct, String type, String organizer_description, String location_name, String start_time, String description) {

		this.end_time = end_time;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.email = email;
		this.logo = logo;
		this._version = version;
		this._copyright = copyright;
		this.timezone = timezone;
		this.state = state;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.start_time = start_time;
		this.description = description;

	}

}