import java.util.ArrayList;

class RootModel {

	public String name;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public int id;
	public String type;
	public String privacy;
	public String topic;
	public String organizer_name;
	public String background_image;
	public CopyrightModel _copyright;
	public String organizer_description;
	public CreatorModel _creator;
	public String email;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String description;
	public String schedule_published_on;
	public String state;
	public String end_time;
	public String start_time;
	public String logo;
	public VersionModel _version;

	public RootModel(String name, Call_for_papersModel call_for_papers, String timezone, int id, String type, String privacy, String topic, String organizer_name, String background_image, CopyrightModel copyright, String organizer_description, CreatorModel creator, String email, String location_name, ArrayList<Social_linksModel> social_links, String code_of_conduct, String description, String schedule_published_on, String state, String end_time, String start_time, String logo, VersionModel version) {

		this.name = name;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.id = id;
		this.type = type;
		this.privacy = privacy;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.email = email;
		this.location_name = location_name;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.end_time = end_time;
		this.start_time = start_time;
		this.logo = logo;
		this._version = version;

	}

}