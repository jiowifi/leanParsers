import java.util.ArrayList;

class RootModel {

	public String description;
	public String start_time;
	public String email;
	public String name;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String state;
	public String schedule_published_on;
	public String timezone;
	public String background_image;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String code_of_conduct;
	public VersionModel _version;
	public String end_time;
	public String privacy;
	public int id;
	public CreatorModel _creator;
	public String logo;

	public RootModel(String description, String start_time, String email, String name, String location_name, Call_for_papersModel call_for_papers, String topic, String organizer_description, CopyrightModel copyright, String state, String schedule_published_on, String timezone, String background_image, String organizer_name, ArrayList<Social_linksModel> social_links, String type, String code_of_conduct, VersionModel version, String end_time, String privacy, int id, CreatorModel creator, String logo) {

		this.description = description;
		this.start_time = start_time;
		this.email = email;
		this.name = name;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.end_time = end_time;
		this.privacy = privacy;
		this.id = id;
		this._creator = creator;
		this.logo = logo;

	}

}