import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String background_image;
	public String type;
	public int id;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String logo;
	public String end_time;
	public String topic;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String schedule_published_on;
	public String location_name;
	public String name;
	public String timezone;
	public String start_time;
	public String email;
	public String state;
	public String description;
	public VersionModel _version;

	public RootModel(String organizer_name, ArrayList<Social_linksModel> social_links, String privacy, String background_image, String type, int id, String code_of_conduct, CopyrightModel copyright, String logo, String end_time, String topic, CreatorModel creator, Call_for_papersModel call_for_papers, String organizer_description, String schedule_published_on, String location_name, String name, String timezone, String start_time, String email, String state, String description, VersionModel version) {

		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.background_image = background_image;
		this.type = type;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.logo = logo;
		this.end_time = end_time;
		this.topic = topic;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.name = name;
		this.timezone = timezone;
		this.start_time = start_time;
		this.email = email;
		this.state = state;
		this.description = description;
		this._version = version;

	}

}