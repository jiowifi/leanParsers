import java.util.ArrayList;

class RootModel {

	public int id;
	public String privacy;
	public String background_image;
	public CopyrightModel _copyright;
	public String description;
	public String type;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String schedule_published_on;
	public String location_name;
	public VersionModel _version;
	public String code_of_conduct;
	public String logo;
	public String timezone;
	public CreatorModel _creator;
	public String end_time;
	public String email;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String topic;
	public String start_time;

	public RootModel(int id, String privacy, String background_image, CopyrightModel copyright, String description, String type, String name, Call_for_papersModel call_for_papers, String state, String schedule_published_on, String location_name, VersionModel version, String code_of_conduct, String logo, String timezone, CreatorModel creator, String end_time, String email, String organizer_name, ArrayList<Social_linksModel> social_links, String organizer_description, String topic, String start_time) {

		this.id = id;
		this.privacy = privacy;
		this.background_image = background_image;
		this._copyright = copyright;
		this.description = description;
		this.type = type;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.timezone = timezone;
		this._creator = creator;
		this.end_time = end_time;
		this.email = email;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.start_time = start_time;

	}

}