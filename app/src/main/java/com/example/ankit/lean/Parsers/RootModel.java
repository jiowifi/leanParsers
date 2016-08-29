import java.util.ArrayList;

class RootModel {

	public String description;
	public String background_image;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String end_time;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String email;
	public int id;
	public String location_name;
	public String topic;
	public String code_of_conduct;
	public String type;
	public String name;
	public String logo;
	public String privacy;
	public String start_time;
	public String state;

	public RootModel(String description, String background_image, String timezone, ArrayList<Social_linksModel> social_links, String organizer_description, VersionModel version, CopyrightModel copyright, String schedule_published_on, String end_time, String organizer_name, Call_for_papersModel call_for_papers, CreatorModel creator, String email, int id, String location_name, String topic, String code_of_conduct, String type, String name, String logo, String privacy, String start_time, String state) {

		this.description = description;
		this.background_image = background_image;
		this.timezone = timezone;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._version = version;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.email = email;
		this.id = id;
		this.location_name = location_name;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.name = name;
		this.logo = logo;
		this.privacy = privacy;
		this.start_time = start_time;
		this.state = state;

	}

}