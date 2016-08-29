import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String topic;
	public String state;
	public String description;
	public String email;
	public String location_name;
	public String logo;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String organizer_name;
	public String timezone;
	public String end_time;
	public int id;
	public CopyrightModel _copyright;
	public String background_image;
	public String privacy;
	public String start_time;
	public String type;
	public String organizer_description;
	public VersionModel _version;

	public RootModel(Call_for_papersModel call_for_papers, String code_of_conduct, ArrayList<Social_linksModel> social_links, String name, String topic, String state, String description, String email, String location_name, String logo, String schedule_published_on, CreatorModel creator, String organizer_name, String timezone, String end_time, int id, CopyrightModel copyright, String background_image, String privacy, String start_time, String type, String organizer_description, VersionModel version) {

		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.name = name;
		this.topic = topic;
		this.state = state;
		this.description = description;
		this.email = email;
		this.location_name = location_name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.end_time = end_time;
		this.id = id;
		this._copyright = copyright;
		this.background_image = background_image;
		this.privacy = privacy;
		this.start_time = start_time;
		this.type = type;
		this.organizer_description = organizer_description;
		this._version = version;

	}

}