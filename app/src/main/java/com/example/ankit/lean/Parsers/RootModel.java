import java.util.ArrayList;

class RootModel {

	public String name;
	public String end_time;
	public String privacy;
	public VersionModel _version;
	public String email;
	public String schedule_published_on;
	public String type;
	public String description;
	public String state;
	public String timezone;
	public int id;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public CopyrightModel _copyright;
	public String location_name;
	public String organizer_name;
	public CreatorModel _creator;
	public String logo;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String code_of_conduct;

	public RootModel(String name, String end_time, String privacy, VersionModel version, String email, String schedule_published_on, String type, String description, String state, String timezone, int id, String organizer_description, Call_for_papersModel call_for_papers, String background_image, CopyrightModel copyright, String location_name, String organizer_name, CreatorModel creator, String logo, String start_time, ArrayList<Social_linksModel> social_links, String topic, String code_of_conduct) {

		this.name = name;
		this.end_time = end_time;
		this.privacy = privacy;
		this._version = version;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.description = description;
		this.state = state;
		this.timezone = timezone;
		this.id = id;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this._copyright = copyright;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.logo = logo;
		this.start_time = start_time;
		this.social_links = social_links;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;

	}

}