import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String code_of_conduct;
	public String end_time;
	public String state;
	public String organizer_name;
	public String name;
	public String organizer_description;
	public CreatorModel _creator;
	public String type;
	public String description;
	public int id;
	public String email;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String background_image;
	public String location_name;
	public String topic;
	public String privacy;
	public String start_time;

	public RootModel(ArrayList<Social_linksModel> social_links, String timezone, String code_of_conduct, String end_time, String state, String organizer_name, String name, String organizer_description, CreatorModel creator, String type, String description, int id, String email, String schedule_published_on, CopyrightModel copyright, VersionModel version, Call_for_papersModel call_for_papers, String logo, String background_image, String location_name, String topic, String privacy, String start_time) {

		this.social_links = social_links;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.state = state;
		this.organizer_name = organizer_name;
		this.name = name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.type = type;
		this.description = description;
		this.id = id;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.background_image = background_image;
		this.location_name = location_name;
		this.topic = topic;
		this.privacy = privacy;
		this.start_time = start_time;

	}

}